package p3;

import android.content.Context;
import com.vungle.ads.internal.signals.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import q3.C2641a;
import s7.InterfaceC2701a;
import t3.AbstractC2706a;
import t3.C2707b;

/* loaded from: classes.dex */
public final class c implements InterfaceC2701a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22212a;
    public final Object b;

    public /* synthetic */ c(Object obj, int i9) {
        this.f22212a = i9;
        this.b = obj;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        switch (this.f22212a) {
            case 0:
                C2707b c2707b = (C2707b) ((InterfaceC2701a) this.b).get();
                HashMap hashMap = new HashMap();
                h3.d dVar = h3.d.b;
                Set emptySet = Collections.emptySet();
                if (emptySet != null) {
                    Long l = 30000L;
                    hashMap.put(dVar, new q3.b(l.longValue(), Long.valueOf(j.TWENTY_FOUR_HOURS_MILLIS).longValue(), emptySet));
                    h3.d dVar2 = h3.d.f20587d;
                    Set emptySet2 = Collections.emptySet();
                    if (emptySet2 != null) {
                        Long l2 = 1000L;
                        hashMap.put(dVar2, new q3.b(l2.longValue(), Long.valueOf(j.TWENTY_FOUR_HOURS_MILLIS).longValue(), emptySet2));
                        h3.d dVar3 = h3.d.f20586c;
                        if (Collections.emptySet() != null) {
                            Long valueOf = Long.valueOf(j.TWENTY_FOUR_HOURS_MILLIS);
                            Long valueOf2 = Long.valueOf(j.TWENTY_FOUR_HOURS_MILLIS);
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(q3.d.f22757c)));
                            if (unmodifiableSet != null) {
                                hashMap.put(dVar3, new q3.b(valueOf.longValue(), valueOf2.longValue(), unmodifiableSet));
                                if (c2707b != null) {
                                    if (hashMap.keySet().size() >= h3.d.values().length) {
                                        new HashMap();
                                        return new C2641a(c2707b, hashMap);
                                    }
                                    throw new IllegalStateException("Not all priorities have been configured");
                                }
                                throw new NullPointerException("missing required property: clock");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            case 1:
                String packageName = ((Context) ((InterfaceC2701a) this.b).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return this.b;
        }
    }

    public c() {
        this.f22212a = 0;
        this.b = AbstractC2706a.f23009a;
    }
}
