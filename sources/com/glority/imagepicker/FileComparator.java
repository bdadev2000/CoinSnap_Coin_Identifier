package com.glority.imagepicker;

import com.glority.imagepicker.bean.Image;
import java.util.Comparator;

/* compiled from: MultiImageSelectorFragment.java */
/* loaded from: classes6.dex */
class FileComparator implements Comparator<Image> {
    @Override // java.util.Comparator
    public int compare(Image image, Image image2) {
        return (image == null || image2 == null || image.time < image2.time) ? 1 : -1;
    }
}
