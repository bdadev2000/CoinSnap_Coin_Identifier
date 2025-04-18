package wh;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class x extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f27239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(List list, int i10) {
        super(0);
        this.f27238b = i10;
        this.f27239c = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f27238b;
        List list = this.f27239c;
        switch (i10) {
            case 0:
            default:
                return list;
        }
    }
}
