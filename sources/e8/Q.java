package e8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class Q extends G7.k implements F7.l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a8.b f20133c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a8.b f20134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(a8.b bVar, a8.b bVar2, int i9) {
        super(1);
        this.b = i9;
        this.f20133c = bVar;
        this.f20134d = bVar2;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                c8.a aVar = (c8.a) obj;
                G7.j.e(aVar, "$this$buildSerialDescriptor");
                c8.a.a(aVar, "key", this.f20133c.getDescriptor());
                c8.a.a(aVar, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f20134d.getDescriptor());
                return t7.y.f23029a;
            default:
                c8.a aVar2 = (c8.a) obj;
                G7.j.e(aVar2, "$this$buildClassSerialDescriptor");
                c8.a.a(aVar2, "first", this.f20133c.getDescriptor());
                c8.a.a(aVar2, "second", this.f20134d.getDescriptor());
                return t7.y.f23029a;
        }
    }
}
