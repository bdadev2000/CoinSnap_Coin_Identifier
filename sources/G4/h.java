package g4;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public abstract class h extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Throwable th) {
        super(str, th);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
