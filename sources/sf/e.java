package sf;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.SoundDomain;
import java.util.ArrayList;
import java.util.List;
import kf.g1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y0.p0;

/* loaded from: classes4.dex */
public final class e extends mf.c {

    /* renamed from: c, reason: collision with root package name */
    public final Context f25027c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f25028d;

    /* renamed from: f, reason: collision with root package name */
    public final SoundDomain f25029f;

    /* renamed from: g, reason: collision with root package name */
    public final Function2 f25030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, Activity activity, SoundDomain soundDomainCurrent, w5.k onItemSoundChosen) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(soundDomainCurrent, "soundDomainCurrent");
        Intrinsics.checkNotNullParameter(onItemSoundChosen, "onItemSoundChosen");
        this.f25027c = context;
        this.f25028d = activity;
        this.f25029f = soundDomainCurrent;
        this.f25030g = onItemSoundChosen;
    }

    @Override // mf.c
    public final int a() {
        return R.layout.dialog_choose_sound;
    }

    @Override // mf.c
    public final void c() {
        RecyclerView recyclerView = ((g1) b()).u;
        tg.c cVar = new tg.c(new w5.k(this, 3));
        List newData = com.facebook.appevents.i.b(this.f25027c);
        Intrinsics.checkNotNullParameter(newData, "newData");
        ArrayList arrayList = cVar.f22239i;
        arrayList.clear();
        arrayList.addAll(newData);
        cVar.notifyDataSetChanged();
        SoundDomain soundDomain = this.f25029f;
        long id2 = soundDomain.getId();
        cVar.f25407l = id2;
        cVar.notifyItemChanged((int) id2);
        recyclerView.setAdapter(cVar);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
        ((g1) b()).f20768v.setText(soundDomain.getName());
        e(this.f25028d, 0.75f);
    }

    @Override // mf.c
    public final void d() {
        ImageView icUp = ((g1) b()).f20767t;
        Intrinsics.checkNotNullExpressionValue(icUp, "icUp");
        com.bumptech.glide.e.p(icUp, new p0(this, 4));
    }
}
