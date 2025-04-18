package ic;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class s extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(long r3, long r5) {
        /*
            r2 = this;
            java.lang.String r0 = "Unexpected audio track timestamp discontinuity: expected "
            java.lang.String r1 = ", got "
            java.lang.StringBuilder r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o(r0, r5, r1)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.s.<init>(long, long):void");
    }

    public s(String str) {
        super(str);
        if (str == null) {
            return;
        }
        str.toLowerCase(Locale.US).getClass();
    }
}
