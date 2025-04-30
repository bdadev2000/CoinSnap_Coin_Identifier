package com.bykv.vk.openvk.preload.b;

/* loaded from: classes.dex */
public interface e {

    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // com.bykv.vk.openvk.preload.b.e
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    <T> T a(Class<T> cls);
}
