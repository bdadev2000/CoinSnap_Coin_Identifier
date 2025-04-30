package I;

import android.content.LocusId;

/* loaded from: classes.dex */
public abstract class l {
    public static LocusId a(String str) {
        return new LocusId(str);
    }

    public static String b(LocusId locusId) {
        return locusId.getId();
    }
}
