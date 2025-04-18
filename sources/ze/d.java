package ze;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class d implements c {
    public final /* synthetic */ int a;

    @Override // ze.c
    public final List a(List list) {
        switch (this.a) {
            case 0:
                Collections.sort(list);
                Collections.reverse(list);
                return list;
            default:
                Collections.sort(list);
                return list;
        }
    }
}
