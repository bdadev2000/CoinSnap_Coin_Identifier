package com.glority.android.xx.constants;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.utils.data.PersistData;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: KeyLogEvents.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/glority/android/xx/constants/KeyLogEvents;", "", "<init>", "()V", KeyLogEvents.new_user_grading, "", KeyLogEvents.new_user_identify_a, "newUserGrading", "Landroid/os/Bundle;", "newUserIdentifyA", "resourceMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes4.dex */
public final class KeyLogEvents {
    public static final KeyLogEvents INSTANCE = new KeyLogEvents();
    private static final String new_user_grading = "new_user_grading";
    private static final String new_user_identify_a = "new_user_identify_a";

    private KeyLogEvents() {
    }

    public final Bundle newUserGrading() {
        Bundle bundleOf = BundleKt.bundleOf(new Pair[0]);
        if (((Boolean) PersistData.INSTANCE.get(new_user_grading, true)).booleanValue()) {
            bundleOf.putString(LogEventArguments.ARG_STRING_5, new_user_grading);
            PersistData.INSTANCE.set(new_user_grading, false);
        }
        return bundleOf;
    }

    public final Bundle newUserIdentifyA() {
        Bundle bundleOf = BundleKt.bundleOf(new Pair[0]);
        if (((Boolean) PersistData.INSTANCE.get(new_user_identify_a, true)).booleanValue()) {
            bundleOf.putString(LogEventArguments.ARG_STRING_5, new_user_identify_a);
            PersistData.INSTANCE.set(new_user_identify_a, false);
        }
        return bundleOf;
    }
}
