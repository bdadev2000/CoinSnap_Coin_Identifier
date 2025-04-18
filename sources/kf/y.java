package kf;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes4.dex */
public abstract class y extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final AppCompatButton f20929t;
    public final ConstraintLayout u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f20930v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f20931w;

    public y(Object obj, View view, AppCompatButton appCompatButton, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(view, 0, obj);
        this.f20929t = appCompatButton;
        this.u = constraintLayout;
        this.f20930v = textView;
        this.f20931w = textView2;
    }
}
