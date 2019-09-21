package com.handmadecode.TodoApp.apiResponse;
import lombok.*;
import java.util.List;

@Getter @Setter
@RequiredArgsConstructor
public class ApiResponse<T> {
    @NonNull private T response;
    private List<String> errors;
}
