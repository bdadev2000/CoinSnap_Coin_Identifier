package z;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements GraphRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f31457b;

    public /* synthetic */ a(List list, int i2) {
        this.f31456a = i2;
        this.f31457b = list;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i2 = this.f31456a;
        List list = this.f31457b;
        switch (i2) {
            case 0:
                ANRHandler.m550sendANRReports$lambda5(list, graphResponse);
                return;
            default:
                CrashHandler.Companion.m552sendExceptionReports$lambda5(list, graphResponse);
                return;
        }
    }
}
