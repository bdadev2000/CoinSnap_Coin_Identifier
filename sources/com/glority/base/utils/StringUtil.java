package com.glority.base.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.glority.base.R;
import com.glority.utils.ui.ToastUtils;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringUtil.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t¨\u0006\r"}, d2 = {"Lcom/glority/base/utils/StringUtil;", "", "<init>", "()V", "copyToClipBoard", "", "context", "Landroid/content/Context;", "text", "", "isEmail", "", "email", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class StringUtil {
    public static final int $stable = 0;
    public static final StringUtil INSTANCE = new StringUtil();

    private StringUtil() {
    }

    public final void copyToClipBoard(Context context, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, text));
        ToastUtils.showShort(R.string.text_copied, 0);
    }

    public final boolean isEmail(String email) {
        if (email == null || Intrinsics.areEqual("", email)) {
            return false;
        }
        return Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*").matcher(email).matches();
    }
}
