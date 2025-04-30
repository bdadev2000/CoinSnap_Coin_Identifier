package I4;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1453a;

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        switch (this.f1453a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                G4.e eVar = (G4.e) obj2;
                eVar.d(J4.f.f1578g, entry.getKey());
                eVar.d(J4.f.f1579h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
