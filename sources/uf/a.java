package uf;

import android.view.View;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomainDelete;
import com.plantcare.ai.identifier.plantid.domains.HistoryDomain;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import com.plantcare.ai.identifier.plantid.domains.ImageDomain;
import com.plantcare.ai.identifier.plantid.domains.SoundDomain;
import dg.d;
import dg.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import mf.f;
import tg.c;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25801d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f25802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, Object obj, int i10, int i11) {
        super(1);
        this.f25799b = i11;
        this.f25802f = fVar;
        this.f25800c = obj;
        this.f25801d = i10;
    }

    public final void a(View view) {
        int i10 = this.f25799b;
        int i11 = this.f25801d;
        Object obj = this.f25800c;
        f fVar = this.f25802f;
        switch (i10) {
            case 0:
                ((b) fVar).f25805m.invoke((HistoryDomain) obj, Integer.valueOf(i11));
                return;
            case 1:
                ((b) fVar).f25805m.invoke((HistoryDomain) obj, Integer.valueOf(i11));
                return;
            case 2:
                ((bg.a) fVar).f2432l.invoke((IapDomain) obj, Integer.valueOf(i11));
                return;
            case 3:
                ((d) fVar).f17036k.invoke((e) obj, Integer.valueOf(i11));
                return;
            case 4:
                ((Function2) ((lg.a) fVar).f21379l).invoke((ImageDomain) obj, Integer.valueOf(i11));
                return;
            case 5:
                ((b) fVar).f25805m.invoke((AlarmDomainDelete) obj, Integer.valueOf(i11));
                return;
            default:
                ((c) fVar).f25406k.invoke(Integer.valueOf(i11), (SoundDomain) obj);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f25799b) {
            case 0:
                a((View) obj);
                return Unit.INSTANCE;
            case 1:
                a((View) obj);
                return Unit.INSTANCE;
            case 2:
                a((View) obj);
                return Unit.INSTANCE;
            case 3:
                a((View) obj);
                return Unit.INSTANCE;
            case 4:
                a((View) obj);
                return Unit.INSTANCE;
            case 5:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i10, SoundDomain soundDomain) {
        super(1);
        this.f25799b = 6;
        this.f25802f = cVar;
        this.f25801d = i10;
        this.f25800c = soundDomain;
    }
}
