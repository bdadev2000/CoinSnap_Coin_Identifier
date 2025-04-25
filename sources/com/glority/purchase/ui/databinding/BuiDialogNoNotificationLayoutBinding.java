package com.glority.purchase.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.purchase.ui.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes9.dex */
public final class BuiDialogNoNotificationLayoutBinding implements ViewBinding {
    public final TextView contentTv;
    public final MaterialButton goSettingTv;
    public final GlTextView laterTv;
    private final FrameLayout rootView;

    private BuiDialogNoNotificationLayoutBinding(FrameLayout frameLayout, TextView textView, MaterialButton materialButton, GlTextView glTextView) {
        this.rootView = frameLayout;
        this.contentTv = textView;
        this.goSettingTv = materialButton;
        this.laterTv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static BuiDialogNoNotificationLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BuiDialogNoNotificationLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bui_dialog_no_notification_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static BuiDialogNoNotificationLayoutBinding bind(View view) {
        int i = R.id.content_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.go_setting_tv;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, i);
            if (materialButton != null) {
                i = R.id.later_tv;
                GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(view, i);
                if (glTextView != null) {
                    return new BuiDialogNoNotificationLayoutBinding((FrameLayout) view, textView, materialButton, glTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
