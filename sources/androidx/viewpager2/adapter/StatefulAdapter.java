package androidx.viewpager2.adapter;

import android.os.Parcelable;

/* loaded from: classes7.dex */
public interface StatefulAdapter {
    void restoreState(Parcelable parcelable);

    Parcelable saveState();
}
