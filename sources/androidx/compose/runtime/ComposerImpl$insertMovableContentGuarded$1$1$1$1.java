package androidx.compose.runtime;

import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.collection.IntMap;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f13721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChangeList f13722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SlotReader f13723c;
    public final /* synthetic */ MovableContentStateReference d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$1$1(ComposerImpl composerImpl, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        super(0);
        this.f13721a = composerImpl;
        this.f13722b = changeList;
        this.f13723c = slotReader;
        this.d = movableContentStateReference;
    }

    @Override // q0.a
    public final Object invoke() {
        ComposerImpl composerImpl = this.f13721a;
        ComposerChangeListWriter composerChangeListWriter = composerImpl.L;
        ChangeList changeList = this.f13722b;
        SlotReader slotReader = this.f13723c;
        MovableContentStateReference movableContentStateReference = this.d;
        ChangeList changeList2 = composerChangeListWriter.f14082b;
        try {
            composerChangeListWriter.f14082b = changeList;
            SlotReader slotReader2 = composerImpl.F;
            int[] iArr = composerImpl.f13702n;
            IntMap intMap = composerImpl.f13709u;
            composerImpl.f13702n = null;
            composerImpl.f13709u = null;
            try {
                composerImpl.F = slotReader;
                boolean z2 = composerChangeListWriter.e;
                try {
                    composerChangeListWriter.e = false;
                    composerImpl.g0(movableContentStateReference.f13833a, movableContentStateReference.f13837g, movableContentStateReference.f13834b, true);
                    composerChangeListWriter.f14082b = changeList2;
                    return b0.f30125a;
                } finally {
                    composerChangeListWriter.e = z2;
                }
            } finally {
                composerImpl.F = slotReader2;
                composerImpl.f13702n = iArr;
                composerImpl.f13709u = intMap;
            }
        } catch (Throwable th) {
            composerChangeListWriter.f14082b = changeList2;
            throw th;
        }
    }
}
