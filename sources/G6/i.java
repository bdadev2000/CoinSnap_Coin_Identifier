package G6;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.tools.arruler.models.InternalImageModel;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class i implements Comparator {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1308c;

    public /* synthetic */ i(Object obj, int i9) {
        this.b = i9;
        this.f1308c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                int compare = ((Comparator) this.f1308c).compare(obj, obj2);
                if (compare == 0) {
                    return com.facebook.appevents.n.a(Long.valueOf(((InternalImageModel) obj2).getLastModified()), Long.valueOf(((InternalImageModel) obj).getLastModified()));
                }
                return compare;
            case 1:
                int compare2 = ((Comparator) this.f1308c).compare(obj, obj2);
                if (compare2 == 0) {
                    return com.facebook.appevents.n.a(Long.valueOf(((InternalImageModel) obj2).getLastModified()), Long.valueOf(((InternalImageModel) obj).getLastModified()));
                }
                return compare2;
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f13977n).compareTo(Boolean.valueOf(materialButton2.f13977n));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f1308c;
                        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
                    }
                    return compareTo2;
                }
                return compareTo;
        }
    }
}
