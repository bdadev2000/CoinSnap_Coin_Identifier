package com.glority.widget.skeleton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public class ShimmerViewHolder extends RecyclerView.ViewHolder {
    public ShimmerViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        super(layoutInflater.inflate(R.layout.gl_layout_shimmer, viewGroup, false));
        ViewGroup viewGroup2 = (ViewGroup) this.itemView;
        View inflate = layoutInflater.inflate(i, viewGroup2, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            viewGroup2.setLayoutParams(layoutParams);
        }
        viewGroup2.addView(inflate);
    }
}
