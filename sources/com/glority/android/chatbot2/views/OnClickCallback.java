package com.glority.android.chatbot2.views;

import androidx.fragment.app.DialogFragment;
import androidx.navigation.compose.DialogNavigator;
import com.glority.android.picturexx.constants.ShortcutConstants;
import kotlin.Metadata;

/* compiled from: ChatbotSurveyDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/glority/android/chatbot2/views/OnClickCallback;", "", "dontShowAgain", "", DialogNavigator.NAME, "Landroidx/fragment/app/DialogFragment;", "rating", "", "onDismissClick", "onSubmitClick", ShortcutConstants.FEEDBACK_SHORTCUT_ID, "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public interface OnClickCallback {
    void dontShowAgain(DialogFragment dialog, int rating);

    void onDismissClick(DialogFragment dialog, int rating);

    void onSubmitClick(DialogFragment dialog, int rating, String feedback);
}
