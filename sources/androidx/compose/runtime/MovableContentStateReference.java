package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred
@InternalComposeApi
/* loaded from: classes2.dex */
public final class MovableContentStateReference {

    /* renamed from: a, reason: collision with root package name */
    public final MovableContent f13833a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13834b;

    /* renamed from: c, reason: collision with root package name */
    public final ControlledComposition f13835c;
    public final SlotTable d;
    public final Anchor e;

    /* renamed from: f, reason: collision with root package name */
    public List f13836f;

    /* renamed from: g, reason: collision with root package name */
    public final PersistentCompositionLocalMap f13837g;

    public MovableContentStateReference(MovableContent movableContent, Object obj, ControlledComposition controlledComposition, SlotTable slotTable, Anchor anchor, List list, PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.f13833a = movableContent;
        this.f13834b = obj;
        this.f13835c = controlledComposition;
        this.d = slotTable;
        this.e = anchor;
        this.f13836f = list;
        this.f13837g = persistentCompositionLocalMap;
    }
}
