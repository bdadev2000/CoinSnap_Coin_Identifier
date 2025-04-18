package m7;

import android.content.Context;
import com.vungle.ads.internal.signals.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c implements k7.b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.a f21634b;

    public /* synthetic */ c(rh.a aVar, int i10) {
        this.a = i10;
        this.f21634b = aVar;
    }

    @Override // rh.a
    public final Object get() {
        int i10 = this.a;
        rh.a aVar = this.f21634b;
        switch (i10) {
            case 0:
                q7.a aVar2 = (q7.a) aVar.get();
                r4.c cVar = new r4.c(13);
                f7.d dVar = f7.d.DEFAULT;
                h.c cVar2 = new h.c(22, 0);
                Set emptySet = Collections.emptySet();
                if (emptySet != null) {
                    cVar2.f18525f = emptySet;
                    cVar2.f18523c = 30000L;
                    cVar2.f18524d = Long.valueOf(j.TWENTY_FOUR_HOURS_MILLIS);
                    ((Map) cVar.f24000d).put(dVar, cVar2.p());
                    f7.d dVar2 = f7.d.HIGHEST;
                    h.c cVar3 = new h.c(22, 0);
                    Set emptySet2 = Collections.emptySet();
                    if (emptySet2 != null) {
                        cVar3.f18525f = emptySet2;
                        cVar3.f18523c = 1000L;
                        cVar3.f18524d = Long.valueOf(j.TWENTY_FOUR_HOURS_MILLIS);
                        ((Map) cVar.f24000d).put(dVar2, cVar3.p());
                        f7.d dVar3 = f7.d.VERY_LOW;
                        h.c cVar4 = new h.c(22, 0);
                        Set emptySet3 = Collections.emptySet();
                        if (emptySet3 != null) {
                            cVar4.f18525f = emptySet3;
                            cVar4.f18523c = Long.valueOf(j.TWENTY_FOUR_HOURS_MILLIS);
                            cVar4.f18524d = Long.valueOf(j.TWENTY_FOUR_HOURS_MILLIS);
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(n7.d.DEVICE_IDLE)));
                            if (unmodifiableSet != null) {
                                cVar4.f18525f = unmodifiableSet;
                                ((Map) cVar.f24000d).put(dVar3, cVar4.p());
                                cVar.f23999c = aVar2;
                                if (aVar2 != null) {
                                    if (((Map) cVar.f24000d).keySet().size() >= f7.d.values().length) {
                                        Map map = (Map) cVar.f24000d;
                                        cVar.f24000d = new HashMap();
                                        return new n7.a((q7.a) cVar.f23999c, map);
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
            default:
                String packageName = ((Context) aVar.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
