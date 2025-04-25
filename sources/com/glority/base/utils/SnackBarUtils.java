package com.glority.base.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.glority.base.R;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnackBarUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/glority/base/utils/SnackBarUtils;", "", "<init>", "()V", "showCenter", "", "inflaterView", "", "v", "Landroid/view/View;", "text", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class SnackBarUtils {
    public static final int $stable = 0;
    public static final SnackBarUtils INSTANCE = new SnackBarUtils();

    private SnackBarUtils() {
    }

    public final void showCenter(int inflaterView, View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        final Snackbar make = Snackbar.make(v, "", -1);
        make.setAnimationMode(1);
        ViewGroup.LayoutParams layoutParams = make.getView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        make.getView().setBackgroundColor(0);
        LayoutInflater from = LayoutInflater.from(make.getView().getContext());
        View view = make.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        from.inflate(inflaterView, (ViewGroup) view, true);
        make.getView().setOnClickListener(new View.OnClickListener() { // from class: com.glority.base.utils.SnackBarUtils$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SnackBarUtils.showCenter$lambda$2$lambda$1(Snackbar.this, view2);
            }
        });
        make.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCenter$lambda$2$lambda$1(Snackbar this_apply, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.dismiss();
    }

    public final void showCenter(View v, String text) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(text, "text");
        final Snackbar make = Snackbar.make(v, "", -1);
        make.setAnimationMode(1);
        ViewGroup.LayoutParams layoutParams = make.getView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        make.getView().setBackgroundColor(0);
        LayoutInflater from = LayoutInflater.from(make.getView().getContext());
        int i = R.layout.normal_snackbar_view;
        View view = make.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        from.inflate(i, (ViewGroup) view, true);
        ((TextView) make.getView().findViewById(R.id.tv)).setText(text);
        make.getView().setOnClickListener(new View.OnClickListener() { // from class: com.glority.base.utils.SnackBarUtils$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SnackBarUtils.showCenter$lambda$5$lambda$4(Snackbar.this, view2);
            }
        });
        make.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCenter$lambda$5$lambda$4(Snackbar this_apply, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.dismiss();
    }

    public final void showCenter(View v, int text) {
        Intrinsics.checkNotNullParameter(v, "v");
        showCenter(v, v.getResources().getText(text).toString());
    }
}
