package p5;

import android.os.Message;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class P implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return com.facebook.appevents.n.a(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}
