package ng;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import kf.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import sf.k;

/* loaded from: classes4.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlantIdentifierActivity f22768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PlantIdentifierActivity plantIdentifierActivity, int i10) {
        super(1);
        this.f22767b = i10;
        this.f22768c = plantIdentifierActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (hf.f.d() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x022b, code lost:
    
        if (hf.f.d() != false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.d.a(android.view.View):void");
    }

    public final void b(Boolean bool) {
        int i10 = this.f22767b;
        PlantIdentifierActivity plantIdentifierActivity = this.f22768c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    k kVar = plantIdentifierActivity.f16676l;
                    if (kVar != null) {
                        kVar.show();
                        return;
                    }
                    return;
                }
                k kVar2 = plantIdentifierActivity.f16676l;
                if (kVar2 != null) {
                    kVar2.cancel();
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    k kVar3 = plantIdentifierActivity.f16676l;
                    if (kVar3 != null) {
                        kVar3.show();
                        return;
                    }
                    return;
                }
                k kVar4 = plantIdentifierActivity.f16676l;
                if (kVar4 != null) {
                    kVar4.cancel();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22767b) {
            case 0:
                b((Boolean) obj);
                return Unit.INSTANCE;
            case 1:
                b((Boolean) obj);
                return Unit.INSTANCE;
            case 2:
                Integer num = (Integer) obj;
                PlantIdentifierActivity plantIdentifierActivity = this.f22768c;
                if (num != null && num.intValue() == 0) {
                    Bitmap bitmap = PlantIdentifierActivity.f16673q;
                    TextView textView = ((e0) plantIdentifierActivity.n()).f20740v;
                    textView.setActivated(true);
                    Intrinsics.checkNotNull(textView);
                    com.bumptech.glide.e.S(textView);
                    TextView textView2 = ((e0) plantIdentifierActivity.n()).u;
                    textView2.setActivated(false);
                    textView2.setTextColor(Color.parseColor("#7DC448"));
                    ((e0) plantIdentifierActivity.n()).C.setActivated(true);
                } else {
                    Bitmap bitmap2 = PlantIdentifierActivity.f16673q;
                    TextView textView3 = ((e0) plantIdentifierActivity.n()).f20740v;
                    textView3.setTextColor(Color.parseColor("#7DC448"));
                    textView3.setActivated(false);
                    TextView textView4 = ((e0) plantIdentifierActivity.n()).u;
                    textView4.setActivated(true);
                    Intrinsics.checkNotNull(textView4);
                    com.bumptech.glide.e.S(textView4);
                    ((e0) plantIdentifierActivity.n()).C.setActivated(false);
                }
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
            case 6:
                a((View) obj);
                return Unit.INSTANCE;
            case 7:
                a((View) obj);
                return Unit.INSTANCE;
            case 8:
                a((View) obj);
                return Unit.INSTANCE;
            case 9:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
