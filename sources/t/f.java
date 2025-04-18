package t;

import a4.j;
import android.media.MediaCodecInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class f implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25122c;

    public /* synthetic */ f(Object obj, int i10) {
        this.f25121b = i10;
        this.f25122c = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12 = this.f25121b;
        Object obj3 = this.f25122c;
        switch (i12) {
            case 0:
                i10 = ((i) obj).f25128c;
                i11 = ((i) obj2).f25128c;
                return i10 - i11;
            case 1:
                i10 = ((int[]) obj)[0];
                i11 = ((int[]) obj2)[0];
                return i10 - i11;
            case 2:
            default:
                j.t(obj3);
                ((MediaCodecInfo) obj).getName();
                throw null;
            case 3:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
                    }
                    return compareTo2;
                }
                return compareTo;
            case 4:
                i10 = ((bd.d) obj).f2422d;
                i11 = ((bd.d) obj2).f2422d;
                return i10 - i11;
        }
    }
}
