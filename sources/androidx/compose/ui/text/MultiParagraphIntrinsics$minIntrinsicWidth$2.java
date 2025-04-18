package androidx.compose.ui.text;

import b1.f0;
import java.util.ArrayList;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MultiParagraphIntrinsics$minIntrinsicWidth$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiParagraphIntrinsics f16927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraphIntrinsics$minIntrinsicWidth$2(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        super(0);
        this.f16927a = multiParagraphIntrinsics;
    }

    @Override // q0.a
    public final Object invoke() {
        Object obj;
        ParagraphIntrinsics paragraphIntrinsics;
        ArrayList arrayList = this.f16927a.e;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = arrayList.get(0);
            float c2 = ((ParagraphIntrinsicInfo) obj2).f16933a.c();
            int p2 = f0.p(arrayList);
            int i2 = 1;
            if (1 <= p2) {
                while (true) {
                    Object obj3 = arrayList.get(i2);
                    float c3 = ((ParagraphIntrinsicInfo) obj3).f16933a.c();
                    if (Float.compare(c2, c3) < 0) {
                        obj2 = obj3;
                        c2 = c3;
                    }
                    if (i2 == p2) {
                        break;
                    }
                    i2++;
                }
            }
            obj = obj2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
        return Float.valueOf((paragraphIntrinsicInfo == null || (paragraphIntrinsics = paragraphIntrinsicInfo.f16933a) == null) ? 0.0f : paragraphIntrinsics.c());
    }
}
