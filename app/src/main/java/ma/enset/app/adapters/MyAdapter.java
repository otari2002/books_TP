package ma.enset.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import ma.enset.app.R;
import ma.enset.app.models.Book;

public class MyAdapter extends ArrayAdapter<Book> {

    public MyAdapter(@NonNull Context context, int resource, int textViewRessourceId, @NonNull List<Book> data) {
        super(context, resource, textViewRessourceId, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_user, parent, false);
        }
        Book book = getItem(position);
        ImageView imageView = convertView.findViewById(R.id.imageViewBook);
        TextView textView = convertView.findViewById(R.id.textView);
        return convertView;
    }

}
