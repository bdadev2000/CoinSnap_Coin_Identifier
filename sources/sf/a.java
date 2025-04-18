package sf;

import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends mf.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SearchPlantResultActivity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // mf.c
    public final int a() {
        return R.layout.dialog_add_plant;
    }

    @Override // mf.c
    public final void c() {
        setCancelable(false);
    }
}
