package pf;

import com.plantcare.ai.identifier.plantid.ui.component.diagnose.DiagnoseActivity;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes4.dex */
public final class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DiagnoseActivity f23636c;

    public /* synthetic */ b(DiagnoseActivity diagnoseActivity, int i10) {
        this.f23635b = i10;
        this.f23636c = diagnoseActivity;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f23635b;
        DiagnoseActivity diagnoseActivity = this.f23636c;
        switch (i10) {
            case 0:
                return ComparisonsKt.compareValues(((kf.e) diagnoseActivity.n()).f1322i.getContext().getString(((rf.a) obj).f24121c), ((kf.e) diagnoseActivity.n()).f1322i.getContext().getString(((rf.a) obj2).f24121c));
            default:
                return ComparisonsKt.compareValues(diagnoseActivity.getString(((rf.a) obj).f24121c), diagnoseActivity.getString(((rf.a) obj2).f24121c));
        }
    }
}
