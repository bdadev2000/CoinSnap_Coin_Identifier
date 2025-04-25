package com.glority.android.picturexx.view.dialog;

import androidx.fragment.app.DialogFragment;
import androidx.navigation.compose.DialogNavigator;
import com.glority.android.picturexx.constants.ShortcutConstants;
import kotlin.Metadata;

/* compiled from: CommonSuggestionsFeedbackDialog.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CommonSuggestionsFeedbackDialogListener;", "", "onFeedbackSubmit", "", DialogNavigator.NAME, "Landroidx/fragment/app/DialogFragment;", ShortcutConstants.FEEDBACK_SHORTCUT_ID, "", "onFeedbackClose", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public interface CommonSuggestionsFeedbackDialogListener {
    void onFeedbackClose(DialogFragment dialog);

    void onFeedbackSubmit(DialogFragment dialog, String feedback);
}
