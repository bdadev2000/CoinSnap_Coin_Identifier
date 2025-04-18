package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.Comparator;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SelectionLayoutBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final long f7188a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7189b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutCoordinates f7190c;
    public final boolean d;
    public final Selection e;

    /* renamed from: f, reason: collision with root package name */
    public final Comparator f7191f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableLongIntMap f7192g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f7193h;

    /* renamed from: i, reason: collision with root package name */
    public int f7194i;

    /* renamed from: j, reason: collision with root package name */
    public int f7195j;

    /* renamed from: k, reason: collision with root package name */
    public int f7196k;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z2, Selection selection, SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1 selectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1) {
        this.f7188a = j2;
        this.f7189b = j3;
        this.f7190c = layoutCoordinates;
        this.d = z2;
        this.e = selection;
        this.f7191f = selectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1;
        int i2 = LongIntMapKt.f1453a;
        this.f7192g = new MutableLongIntMap(6);
        this.f7193h = new ArrayList();
        this.f7194i = -1;
        this.f7195j = -1;
        this.f7196k = -1;
    }

    public final int a(int i2, Direction direction, Direction direction2) {
        if (i2 != -1) {
            return i2;
        }
        int ordinal = SelectionLayoutKt.c(direction, direction2).ordinal();
        if (ordinal == 0) {
            return this.f7196k - 1;
        }
        if (ordinal == 1) {
            return this.f7196k;
        }
        if (ordinal == 2) {
            return i2;
        }
        throw new RuntimeException();
    }
}
