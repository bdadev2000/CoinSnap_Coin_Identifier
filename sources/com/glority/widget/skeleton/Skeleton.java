package com.glority.widget.skeleton;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.widget.skeleton.RecyclerViewSkeletonScreen;
import com.glority.widget.skeleton.ViewSkeletonScreen;

/* loaded from: classes12.dex */
public class Skeleton {
    public static RecyclerViewSkeletonScreen.Builder bind(RecyclerView recyclerView) {
        return new RecyclerViewSkeletonScreen.Builder(recyclerView);
    }

    public static ViewSkeletonScreen.Builder bind(View view) {
        return new ViewSkeletonScreen.Builder(view);
    }
}
