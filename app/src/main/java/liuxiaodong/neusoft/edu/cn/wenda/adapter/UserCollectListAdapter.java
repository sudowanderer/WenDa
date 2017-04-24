package liuxiaodong.neusoft.edu.cn.wenda.adapter;

import android.support.v7.widget.RecyclerView;

import liuxiaodong.neusoft.edu.cn.wenda.base.BaseActivity;
import liuxiaodong.neusoft.edu.cn.wenda.listener.base.relevantlist.onCollectionLongClickListener;
import liuxiaodong.neusoft.edu.cn.wenda.model.Question;

/**
 * Created by DONG on 2017/3/14.
 */

public class UserCollectListAdapter extends HomeAdapter {
    public UserCollectListAdapter(BaseActivity activity) {
        super(activity);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);

        if (holder instanceof MyViewHolder) {
            Question question = questions.get(position);
            MyViewHolder viewHolder = (MyViewHolder) holder;
            viewHolder.cvItem.setOnLongClickListener(new onCollectionLongClickListener(question.getObjectId(), activity));
        }


    }
}