package com.glority.chatbot2.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.chatbot2.widget.ChatbotScrollableEditText;
import com.glority.android.chatbot2.widget.FiveStarRatingBar;
import com.glority.chatbot2.R;
import com.glority.widget.GlTextView;

/* loaded from: classes6.dex */
public class ChatbotDialogChatbotSurveyBindingImpl extends ChatbotDialogChatbotSurveyBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final FrameLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tv_dialog_title, 1);
        sparseIntArray.put(R.id.rating_bar, 2);
        sparseIntArray.put(R.id.et_content, 3);
        sparseIntArray.put(R.id.tv_submit, 4);
        sparseIntArray.put(R.id.tv_dont_show_again, 5);
        sparseIntArray.put(R.id.tv_survey_close, 6);
    }

    public ChatbotDialogChatbotSurveyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private ChatbotDialogChatbotSurveyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ChatbotScrollableEditText) objArr[3], (FiveStarRatingBar) objArr[2], (TextView) objArr[1], (GlTextView) objArr[5], (TextView) objArr[4], (ImageView) objArr[6]);
        this.mDirtyFlags = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
