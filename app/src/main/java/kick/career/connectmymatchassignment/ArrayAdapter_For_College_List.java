package kick.career.connectmymatchassignment;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import javax.security.auth.Subject;

import kick.career.connectmymatchassignment.ModelClasses.SubjectBean;

public class ArrayAdapter_For_College_List extends ArrayAdapter<SubjectBean> {
    Context context;

    public ArrayAdapter_For_College_List(Context context, int resource, List<SubjectBean> objects) {
        super(context, resource, objects);
        this.context=context;
    }
    private class ViewHolder {
        TextView sub_name;

    }

    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = null;
        SubjectBean rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            assert mInflater != null;
            convertView = mInflater.inflate(R.layout.subject_list, null);
            holder = new ViewHolder();
            holder.sub_name = (TextView) convertView.findViewById(R.id.sub_name);

            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        assert rowItem != null;
        holder.sub_name.setText(rowItem.getSubjectName());


        return convertView;
    }

}
