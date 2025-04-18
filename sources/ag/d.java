package ag;

import a4.i;
import a4.t;
import a4.u;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import b0.g;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import g3.e;
import hf.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IapActivity f487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(IapActivity iapActivity, int i10) {
        super(1);
        this.f486b = i10;
        this.f487c = iapActivity;
    }

    public final void a(View view) {
        k3.a aVar;
        k3.a aVar2;
        List iaps;
        String str;
        int i10 = this.f486b;
        int i11 = 0;
        IapActivity iapActivity = this.f487c;
        switch (i10) {
            case 0:
                iapActivity.finish();
                return;
            case 1:
                int i12 = IapActivity.f16628k;
                iapActivity.getClass();
                if (com.bumptech.glide.d.q(iapActivity)) {
                    IapDomain iapDomain = iapActivity.f16631h;
                    if (iapDomain != null) {
                        if (!iapDomain.isTypeSubYear()) {
                            String idSub = iapDomain.getIdSub();
                            if (f.c()) {
                                iaps = va.b.m();
                            } else {
                                iaps = va.b.n();
                            }
                            Intrinsics.checkNotNullParameter(iaps, "iaps");
                            Intrinsics.checkNotNullParameter(idSub, "idSub");
                            int size = iaps.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size) {
                                    if (((IapDomain) iaps.get(i13)).isTypeSubYear()) {
                                        iaps.remove(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            List sortedWith = CollectionsKt.sortedWith(iaps, new g(9));
                            int size2 = sortedWith.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size2) {
                                    if (Intrinsics.areEqual(idSub, ((IapDomain) sortedWith.get(i14)).getIdSub())) {
                                        i11 = i14;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            Log.d("duylt", "Util: " + sortedWith);
                            ArrayList arrayList = iapActivity.f16632i;
                            if (true ^ arrayList.isEmpty()) {
                                Log.d("duylt", "Screen: " + arrayList);
                                d3.g gVar = new d3.g();
                                gVar.G((u) arrayList.get(i11));
                                z1 o10 = r0.o(gVar.k());
                                Intrinsics.checkNotNullExpressionValue(o10, "of(...)");
                                a4.f fVar = new a4.f();
                                fVar.f112d = new ArrayList(o10);
                                i b3 = fVar.b();
                                Intrinsics.checkNotNullExpressionValue(b3, "build(...)");
                                a4.d dVar = iapActivity.f16630g;
                                if (dVar != null) {
                                    dVar.H(iapActivity, b3);
                                }
                            } else {
                                com.bumptech.glide.d.E(iapActivity, R.string.some_thing_went_wrong);
                            }
                            if (iapDomain.getNumberOfScans() == 50) {
                                str = "IAP_Click_50scans";
                            } else {
                                str = "IAP_Click_200scans";
                            }
                            xg.b bVar = xg.b.a;
                            Intrinsics.checkNotNullExpressionValue("IapActivity", "getSimpleName(...)");
                            bVar.b("IapActivity", str);
                        } else {
                            g3.c a = g3.c.a();
                            String idSub2 = iapDomain.getIdSub();
                            a.getClass();
                            if (l3.a.a.booleanValue()) {
                                if (a.f18011f == null) {
                                    k3.a aVar3 = a.f18008c;
                                    if (aVar3 != null) {
                                        ((b) aVar3).a("Billing error init");
                                    }
                                } else {
                                    u uVar = (u) a.f18013h.get("android.test.purchased");
                                    if (l3.a.a.booleanValue()) {
                                        new e(uVar, iapActivity, a.f18008c).show();
                                    } else if (uVar != null) {
                                        a.f18015j = "android.test.purchased";
                                        a.f18016k = 1;
                                        d3.g gVar2 = new d3.g();
                                        gVar2.G(uVar);
                                        z1 o11 = r0.o(gVar2.k());
                                        a4.f fVar2 = new a4.f();
                                        fVar2.f112d = new ArrayList(o11);
                                        int i15 = a.f18010e.H(iapActivity, fVar2.b()).a;
                                        if (i15 != 1) {
                                            if (i15 != 2) {
                                                if (i15 != 3) {
                                                    if (i15 == 6 && (aVar2 = a.f18008c) != null) {
                                                        ((b) aVar2).a("Error completing request");
                                                    }
                                                } else {
                                                    k3.a aVar4 = a.f18008c;
                                                    if (aVar4 != null) {
                                                        ((b) aVar4).a("Billing not supported for type of request");
                                                    }
                                                }
                                            } else {
                                                k3.a aVar5 = a.f18008c;
                                                if (aVar5 != null) {
                                                    ((b) aVar5).a("Network error.");
                                                }
                                            }
                                        } else {
                                            k3.a aVar6 = a.f18008c;
                                            if (aVar6 != null) {
                                                ((b) aVar6).a("Request Canceled");
                                            }
                                        }
                                    }
                                }
                            } else if (a.f18012g == null) {
                                k3.a aVar7 = a.f18008c;
                                if (aVar7 != null) {
                                    ((b) aVar7).a("Billing error init");
                                }
                            } else {
                                HashMap hashMap = a.f18014i;
                                u uVar2 = (u) hashMap.get(idSub2);
                                if (uVar2 != null) {
                                    ArrayList arrayList2 = ((u) hashMap.get(idSub2)).f168i;
                                    String str2 = ((t) arrayList2.get(arrayList2.size() - 1)).a;
                                    d3.g gVar3 = new d3.g();
                                    gVar3.G(uVar2);
                                    if (!TextUtils.isEmpty(str2)) {
                                        gVar3.f16813d = str2;
                                        z1 o12 = r0.o(gVar3.k());
                                        a4.f fVar3 = new a4.f();
                                        fVar3.f112d = new ArrayList(o12);
                                        int i16 = a.f18010e.H(iapActivity, fVar3.b()).a;
                                        if (i16 != 1) {
                                            if (i16 != 2) {
                                                if (i16 != 3) {
                                                    if (i16 == 6 && (aVar = a.f18008c) != null) {
                                                        ((b) aVar).a("Error completing request");
                                                    }
                                                } else {
                                                    k3.a aVar8 = a.f18008c;
                                                    if (aVar8 != null) {
                                                        ((b) aVar8).a("Billing not supported for type of request");
                                                    }
                                                }
                                            } else {
                                                k3.a aVar9 = a.f18008c;
                                                if (aVar9 != null) {
                                                    ((b) aVar9).a("Network error.");
                                                }
                                            }
                                        } else {
                                            k3.a aVar10 = a.f18008c;
                                            if (aVar10 != null) {
                                                ((b) aVar10).a("Request Canceled");
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException("offerToken can not be empty");
                                    }
                                }
                            }
                            xg.b bVar2 = xg.b.a;
                            Intrinsics.checkNotNullExpressionValue("IapActivity", "getSimpleName(...)");
                            bVar2.b("IapActivity", "IAP_Click_yearly");
                        }
                        xg.b bVar3 = xg.b.a;
                        Intrinsics.checkNotNullExpressionValue("IapActivity", "getSimpleName(...)");
                        bVar3.b("IapActivity", "IAP_Click_Continue");
                        return;
                    }
                    return;
                }
                com.bumptech.glide.d.E(iapActivity, R.string.no_internet_connection);
                return;
            case 2:
                int i17 = IapActivity.f16628k;
                iapActivity.getClass();
                try {
                    iapActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sites.google.com/view/anhtuannt0308mypolicy")));
                    return;
                } catch (Exception unused) {
                    Toast.makeText(iapActivity, "Something went wrong", 0).show();
                    return;
                }
            default:
                if (iapActivity.f16629f) {
                    Intent intent = new Intent(iapActivity, (Class<?>) MainActivity.class);
                    intent.putExtra("KEY_START_FROM_IAP_TO_MAIN", true);
                    iapActivity.startActivity(intent);
                    iapActivity.finish();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f486b) {
            case 0:
                a((View) obj);
                return Unit.INSTANCE;
            case 1:
                a((View) obj);
                return Unit.INSTANCE;
            case 2:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
