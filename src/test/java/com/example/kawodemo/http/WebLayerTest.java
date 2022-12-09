package com.example.kawodemo.http;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.kawodemo.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class WebLayerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AccountService accountService;

    @Test
    public void shouldReturnPong() throws Exception {
        this.mockMvc.perform(get("/admin/ping")).andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("pong")));
    }

    @Test
    public void shouldReturnAllAccount() throws Exception {
        this.mockMvc.perform(get("/api/account")).andDo(print()).andExpect(status().isOk());
    }
}
