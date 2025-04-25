package com.glority.base.utils;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.glority.android.core.app.AppContext;
import com.glority.base.routers.OpenManageMembershipActivityRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MembershipABUtil.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/glority/base/utils/MembershipABUtil;", "", "<init>", "()V", "start", "", "memoNo", "", "requestCode", "", "from", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class MembershipABUtil {
    public static final int $stable = 0;
    public static final MembershipABUtil INSTANCE = new MembershipABUtil();

    private MembershipABUtil() {
    }

    public static /* synthetic */ void start$default(MembershipABUtil membershipABUtil, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        membershipABUtil.start(str, i, str2);
    }

    public final void start(String memoNo, int requestCode, String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        String str = memoNo;
        if (str == null || str.length() == 0 || memoNo.length() < 5) {
            return;
        }
        String substring = memoNo.substring(0, memoNo.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        try {
            Intent intent = new Intent(AppContext.INSTANCE.peekContext(), Class.forName("com.glority.android.membership.memo" + substring + ".activity.ManageMemberShip" + substring + ((char) (StringsKt.last(str) + 16)) + "Activity"));
            Context peekContext = AppContext.INSTANCE.peekContext();
            if (peekContext instanceof AppCompatActivity) {
                ((AppCompatActivity) peekContext).startActivityForResult(intent, requestCode);
            } else {
                intent.addFlags(268435456);
                peekContext.startActivity(intent);
            }
        } catch (Throwable unused) {
            new OpenManageMembershipActivityRequest(from, "default").post();
        }
    }
}
