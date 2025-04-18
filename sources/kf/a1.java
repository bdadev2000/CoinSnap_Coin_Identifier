package kf;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class a1 extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f20697t;
    public final ProgressBar u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f20698v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f20699w;

    public a1(Object obj, View view, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, TextView textView) {
        super(view, 0, obj);
        this.f20697t = linearLayout;
        this.u = progressBar;
        this.f20698v = recyclerView;
        this.f20699w = textView;
    }
}
