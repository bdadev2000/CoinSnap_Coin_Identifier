package ig;

import android.view.View;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qf.a f19647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlantDomain f19648d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(qf.a aVar, PlantDomain plantDomain, int i10, int i11) {
        super(1);
        this.f19646b = i11;
        this.f19647c = aVar;
        this.f19648d = plantDomain;
        this.f19649f = i10;
    }

    public final void a(View view) {
        int i10 = this.f19646b;
        PlantDomain plantDomain = this.f19648d;
        int i11 = this.f19649f;
        qf.a aVar = this.f19647c;
        switch (i10) {
            case 0:
                ((Function2) aVar.f23901l).invoke(plantDomain, Integer.valueOf(i11));
                return;
            default:
                ((Function2) aVar.f23902m).invoke(plantDomain, Integer.valueOf(i11));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f19646b) {
            case 0:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
