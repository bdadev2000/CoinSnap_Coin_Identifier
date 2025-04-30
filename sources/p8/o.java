package p8;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class o extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22431e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f22432f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22433g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f22434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, s sVar, int i9, List list) {
        super(str, true);
        this.f22432f = sVar;
        this.f22433g = i9;
        this.f22434h = list;
    }

    @Override // l8.a
    public final long a() {
        switch (this.f22431e) {
            case 0:
                C c9 = this.f22432f.f22456n;
                List list = this.f22434h;
                c9.getClass();
                G7.j.e(list, "responseHeaders");
                try {
                    this.f22432f.f22445A.j(this.f22433g, EnumC2574b.CANCEL);
                    synchronized (this.f22432f) {
                        this.f22432f.f22447C.remove(Integer.valueOf(this.f22433g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                C c10 = this.f22432f.f22456n;
                List list2 = this.f22434h;
                c10.getClass();
                G7.j.e(list2, "requestHeaders");
                try {
                    this.f22432f.f22445A.j(this.f22433g, EnumC2574b.CANCEL);
                    synchronized (this.f22432f) {
                        this.f22432f.f22447C.remove(Integer.valueOf(this.f22433g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, s sVar, int i9, List list, boolean z8) {
        super(str, true);
        this.f22432f = sVar;
        this.f22433g = i9;
        this.f22434h = list;
    }
}
