package com.teamnexters.archive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArchiveController {

	@Autowired
	private ArchiveService archiveService;
}
