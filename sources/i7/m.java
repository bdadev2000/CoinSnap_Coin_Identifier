package i7;

import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class m implements k7.b {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i10) {
        this.a = i10;
    }

    @Override // rh.a
    public final Object get() {
        int i10 = 1;
        int i11 = this.a;
        switch (i11) {
            case 0:
                return new x2.b(Executors.newSingleThreadExecutor(), i10);
            case 1:
                return "com.google.android.datatransport.events";
            case 2:
                return Integer.valueOf(o7.m.f23157f);
            case 3:
                o7.a aVar = o7.a.f23135f;
                if (aVar != null) {
                    return aVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 4:
                switch (i11) {
                    case 4:
                        return new q7.b(1);
                    default:
                        return new q7.b(0);
                }
            default:
                switch (i11) {
                    case 4:
                        return new q7.b(1);
                    default:
                        return new q7.b(0);
                }
        }
    }
}
