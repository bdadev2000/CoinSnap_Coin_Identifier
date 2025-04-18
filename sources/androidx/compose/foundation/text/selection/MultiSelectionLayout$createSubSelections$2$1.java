package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongObjectMap;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class MultiSelectionLayout$createSubSelections$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiSelectionLayout f7073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableLongObjectMap f7074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Selection f7075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectionLayout$createSubSelections$2$1(MultiSelectionLayout multiSelectionLayout, MutableLongObjectMap mutableLongObjectMap, Selection selection) {
        super(1);
        this.f7073a = multiSelectionLayout;
        this.f7074b = mutableLongObjectMap;
        this.f7075c = selection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SelectableInfo selectableInfo = (SelectableInfo) obj;
        int length = selectableInfo.f7082f.f17046a.f17038a.f16880a.length();
        this.f7073a.getClass();
        MultiSelectionLayout.m(this.f7074b, this.f7075c, selectableInfo, 0, length);
        return b0.f30125a;
    }
}
