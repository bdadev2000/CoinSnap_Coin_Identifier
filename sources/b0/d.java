package B0;

import G7.j;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import com.vungle.ads.internal.ui.i;

/* loaded from: classes.dex */
public final class d extends f {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopicsManager topicsManager, int i9) {
        super(topicsManager);
        this.b = i9;
    }

    @Override // B0.f
    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        switch (this.b) {
            case 1:
                j.e(aVar, i.REQUEST_KEY_EXTRA);
                adsSdkName = A0.b.d().setAdsSdkName(aVar.f253a);
                shouldRecordObservation = adsSdkName.setShouldRecordObservation(aVar.b);
                build = shouldRecordObservation.build();
                j.d(build, "Builder()\n            .s…ion)\n            .build()");
                return build;
            default:
                return super.a(aVar);
        }
    }
}
