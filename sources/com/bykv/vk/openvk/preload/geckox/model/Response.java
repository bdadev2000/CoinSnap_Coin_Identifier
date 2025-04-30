package com.bykv.vk.openvk.preload.geckox.model;

import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.a.a.c;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;

/* loaded from: classes.dex */
public class Response<T> {

    @c(a = DataSchemeDataSource.SCHEME_DATA)
    public T data;

    @c(a = NotificationCompat.CATEGORY_STATUS)
    public int status;
}
