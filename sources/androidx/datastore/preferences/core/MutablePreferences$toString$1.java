package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Map;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
final class MutablePreferences$toString$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final MutablePreferences$toString$1 f19090a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        a.s(entry, "entry");
        return "  " + ((Preferences.Key) entry.getKey()).f19096a + " = " + entry.getValue();
    }
}
