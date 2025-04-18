package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;

/* loaded from: classes4.dex */
final class TypefaceDirtyTrackerLinkedList {

    /* renamed from: a, reason: collision with root package name */
    public final State f17433a;

    /* renamed from: b, reason: collision with root package name */
    public final TypefaceDirtyTrackerLinkedList f17434b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17435c;

    public TypefaceDirtyTrackerLinkedList(State state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.f17433a = state;
        this.f17434b = typefaceDirtyTrackerLinkedList;
        this.f17435c = state.getValue();
    }

    public final boolean a() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
        return this.f17433a.getValue() != this.f17435c || ((typefaceDirtyTrackerLinkedList = this.f17434b) != null && typefaceDirtyTrackerLinkedList.a());
    }
}
