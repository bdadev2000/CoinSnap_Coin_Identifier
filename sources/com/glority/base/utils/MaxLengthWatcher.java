package com.glority.base.utils;

import android.app.Activity;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import com.glority.base.R;
import com.glority.utils.app.ResUtils;
import com.glority.utils.ui.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaxLengthWatcher.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J(\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/glority/base/utils/MaxLengthWatcher;", "Landroid/text/TextWatcher;", "maxLen", "", "editText", "Landroid/widget/EditText;", "activity", "Landroid/app/Activity;", "<init>", "(ILandroid/widget/EditText;Landroid/app/Activity;)V", "toastMessage", "", "(ILandroid/widget/EditText;Landroid/app/Activity;Ljava/lang/String;)V", "afterTextChanged", "", "arg0", "Landroid/text/Editable;", "beforeTextChanged", "", "arg1", "arg2", "arg3", "onTextChanged", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public class MaxLengthWatcher implements TextWatcher {
    public static final int $stable = 8;
    private EditText editText;
    private int maxLen;
    private String toastMessage;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
    }

    public MaxLengthWatcher(int i, EditText editText, Activity activity) {
        this.maxLen = i;
        this.editText = editText;
    }

    public MaxLengthWatcher(int i, EditText editText, Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.maxLen = i;
        this.editText = editText;
        this.toastMessage = str;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable arg0) {
        Editable text;
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        EditText editText = this.editText;
        if (editText == null || (text = editText.getText()) == null || text.length() <= this.maxLen) {
            return;
        }
        int selectionEnd = Selection.getSelectionEnd(text);
        String substring = text.toString().substring(0, this.maxLen);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        editText.setText(substring);
        Editable text2 = editText.getText();
        if (selectionEnd > text2.length()) {
            selectionEnd = text2.length();
        }
        Selection.setSelection(text2, selectionEnd);
        String str = this.toastMessage;
        if (str == null) {
            str = ResUtils.getString(R.string.text_content_max_length, Integer.valueOf(this.maxLen));
        } else if (str == null) {
            str = "";
        }
        ToastUtils.showShort(str, new Object[0]);
    }
}
