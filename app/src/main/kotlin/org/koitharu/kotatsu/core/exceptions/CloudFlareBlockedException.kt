package org.koitharu.kotatsu.core.exceptions

import okio.IOException
import org.koitharu.kotatsu.parsers.model.MangaSource

class CloudFlareBlockedException(
	val url: String,
	val source: MangaSource?,
) : IOException("Blocked by CloudFlare")
