package s6;

import G7.j;
import I6.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import r7.InterfaceC2683c;
import w6.C2910a;

/* loaded from: classes3.dex */
public final class e implements InterfaceC2683c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22977a;
    public final f b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22978c;

    public /* synthetic */ e(f fVar, int i9, int i10) {
        this.f22977a = i10;
        this.b = fVar;
        this.f22978c = i9;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        switch (this.f22977a) {
            case 0:
                f fVar = this.b;
                int i9 = this.f22978c;
                if (i9 != 0) {
                    if (i9 == 1) {
                        Context context = fVar.f22979a.f2969c;
                        if (context != null) {
                            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                            j.d(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
                            return defaultSharedPreferences;
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                    }
                    throw new AssertionError(i9);
                }
                Context context2 = fVar.f22979a.f2969c;
                if (context2 != null) {
                    return new C2910a(context2);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                f fVar2 = this.b;
                int i10 = this.f22978c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                return new W6.f((SharedPreferences) fVar2.f22981d.get());
                            }
                            throw new AssertionError(i10);
                        }
                        return new N6.j((C2910a) fVar2.f22980c.get());
                    }
                    return new i((C2910a) fVar2.f22980c.get());
                }
                return new z6.i((C2910a) fVar2.f22980c.get());
        }
    }
}
