package tg;

import android.view.View;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomain;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f25400c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlarmDomain f25401d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25402f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, AlarmDomain alarmDomain, int i10, int i11) {
        super(1);
        this.f25399b = i11;
        this.f25400c = bVar;
        this.f25401d = alarmDomain;
        this.f25402f = i10;
    }

    public final void a(View view) {
        int i10 = this.f25399b;
        AlarmDomain alarmDomain = this.f25401d;
        int i11 = this.f25402f;
        b bVar = this.f25400c;
        switch (i10) {
            case 0:
                bVar.f25404l.invoke(alarmDomain, Integer.valueOf(i11));
                return;
            default:
                bVar.f25405m.invoke(alarmDomain, Integer.valueOf(i11));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f25399b) {
            case 0:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
